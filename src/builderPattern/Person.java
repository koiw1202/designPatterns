package builderPattern;


public class Person {

    private String name ;
    private int age ;
    private String sex ;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name ;
        this.age = age ;
        this.sex = sex ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return  this.name + " " + this.sex + " " + this.age ;
    }

    public static class PersonBuilder {
        private String name ;
        private int age ;
        private String sex ;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder sex(String sex) {
            this.sex = sex ;
            return this ;
        }

        PersonBuilder() {

        }

        public Person build() {

            return new Person(name, age, sex);
        }
    }
}