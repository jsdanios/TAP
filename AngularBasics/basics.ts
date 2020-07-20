function sayHello(person: string): string {
    return "Hello, " + person;
}

var user = "Super Student";

document.getElementById("p1").innerHTML = sayHello(user);

class Person {
    firstName: string;
    lastName: string;
    age: number;
    phoneNumber: number;
    state: string;
    zipCode: number;
    occupation: string;
    hourlyWage: number;
    hours?: number;
    certifications: string[];

    constructor(firstName: string, lastName: string, age: number, phoneNumber: number, state: string, zipCode: number, occupation: string, hourlyWage: number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.zipCode = zipCode;
        this.occupation = occupation;
        this.hourlyWage = hourlyWage;
    }

    details(): string {
        return this.firstName + " " + this.lastName + " is " + this.age + " years old.";
    }

    wage(hourlyWage: number, hours?: number): number {
        this.hourlyWage = hourlyWage;
        if (hours) {
            this.hours = hours;
            return hourlyWage * hours;
        } else {
            return hourlyWage * 40;
        }
    }

    addCerts(...args: string[]): string[] {
        for (let i = 0; i < args.length; i++) {
            this.certifications.push(args[i]);
        }
        return this.certifications;
    }

    createPerson(options: PersonOptions): {firstName: string; lastName: string; age: number; phoneNumber: number; state: string; zipCode: number; occupation: string; hourlyWage: number} {
        let newDetails = {firstName: "", lastName: "", age: null, phoneNumber: null, state: "", zipCode: null, occupation: "", hourlyWage: null}
        newDetails.firstName = options.firstName;
        newDetails.lastName = options.lastName;
        if (options.age) {
            newDetails.age = options.age;
        }
        if (options.phoneNumber) {
            newDetails.phoneNumber = options.phoneNumber;        
        }
        if (options.state) {
            newDetails.state = options.state;
        }
        if (options.zipCode) {
            newDetails.zipCode = options.zipCode;
        }
        if (options.occupation) {
            newDetails.occupation = options.occupation;
        }
        if (options.hourlyWage) {
            newDetails.hourlyWage = options.hourlyWage;
        }
        return newDetails;
    }
}

interface PersonOptions {
    firstName: string;
    lastName: string;
    age?: number;
    phoneNumber?: number;
    state?: string;
    zipCode?: number;
    occupation?: string;
    hourlyWage?: number;
    certifications?: string[];    
}

var person_one = new Person("Josiah", "Taylor", 23, 9124141209, "Georgia", 30750, "student", 10);

document.getElementById("two").innerHTML = person_one.details();