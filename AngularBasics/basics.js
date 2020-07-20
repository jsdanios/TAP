function sayHello(person) {
    return "Hello, " + person;
}
var user = "Super Student";
document.getElementById("p1").innerHTML = sayHello(user);
var Person = /** @class */ (function () {
    function Person(firstName, lastName, age, phoneNumber, state, zipCode, occupation, hourlyWage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.zipCode = zipCode;
        this.occupation = occupation;
        this.hourlyWage = hourlyWage;
    }
    Person.prototype.details = function () {
        return this.firstName + " " + this.lastName + " is " + this.age + " years old.";
    };
    Person.prototype.wage = function (hourlyWage, hours) {
        this.hourlyWage = hourlyWage;
        if (hours) {
            this.hours = hours;
            return hourlyWage * hours;
        }
        else {
            return hourlyWage * 40;
        }
    };
    Person.prototype.addCerts = function () {
        var args = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            args[_i] = arguments[_i];
        }
        for (var i = 0; i < args.length; i++) {
            this.certifications.push(args[i]);
        }
        return this.certifications;
    };
    Person.prototype.createPerson = function (options) {
        var newDetails = { firstName: "", lastName: "", age: null, phoneNumber: null, state: "", zipCode: null, occupation: "", hourlyWage: null };
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
    };
    return Person;
}());
var person_one = new Person("Josiah", "Taylor", 23, 9124141209, "Georgia", 30750, "student", 10);
document.getElementById("two").innerHTML = person_one.details();
