package com.tts.WeatherApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    @Autowired
    private ZipCodeRepository zipCodeRepository;

    public Response getForecast(String zipCode) {
        apiKey = "8e94c396acf4139befdf6091a022e77c";
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + ",us&appid=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();


        try {
            return restTemplate.getForObject(url, Response.class);
        } catch (HttpClientErrorException ex) {
            Response response = new Response();
            response.setName("error");
            return response;
        }
    }
    
    public List<ZipCode> findLast10() {
        List<ZipCode> zipCodeList = zipCodeRepository.findAllByOrderByIdDesc();
        List<ZipCode> last10;
        if (zipCodeList.size() > 10) {
            last10 = zipCodeList.subList(0,10);
        } else {
            last10 = zipCodeList.subList(0,zipCodeList.size());
        }
        
        return last10;
    }

    public void save(ZipCode zipCode) {
        zipCodeRepository.save(zipCode);
    }   
}