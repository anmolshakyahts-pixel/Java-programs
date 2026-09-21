package Exception_Handling;

    class Animal {
        String species;
        Animal() {
            this("Unknown Species");
            System.out.println("Animal: Default Constructor Called");
        }
        Animal(String species) {
            this.species = species;
            System.out.println("Animal: Parameterized Constructor Called (" + species + ")");
        }
    }

    class Dog extends Animal {
        String name;
        String breed;

        Dog() {
            this("Unnamed Dog", "Unknown Breed");
            System.out.println("Dog: Default Constructor Called");
        }
        Dog(String name, String breed) {
            super("Canine");
            this.name = name;
            this.breed = breed;
            System.out.println("Dog: Parameterized Constructor Called (" + name + ", " + breed + ")");
        }
    }

    public class constructorchanning{
        public static void main(String[] args) {
            System.out.println("--- Creating Dog Object using Default Constructor ---");
            Dog d1 = new Dog();

            System.out.println("\n--- Creating Dog Object using Parameterized Constructor ---");
            Dog d2 = new Dog("Buddy", "Golden Retriever");
        }
    }
