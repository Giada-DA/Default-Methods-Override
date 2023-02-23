public class Start {
    public static void main(String[] args) {
        SmartphonePrice producerPixel7Pro = new SmartphonePrice("producer", 413);
        SmartphonePrice producerIphone14ProMax = new SmartphonePrice("producer", 464);
        SmartphonePrice retailPixel7Pro = new SmartphonePrice("retail", 899);
        SmartphonePrice retailIphone14ProMax = new SmartphonePrice("retail", 1489);

        Smartphone pixel7Pro = new Smartphone("Pixel", "7 Pro", 5000, producerPixel7Pro, retailPixel7Pro);
        Smartphone iphone14ProMax = new Smartphone("Iphone", "14 Pro Max", 4323, producerIphone14ProMax, retailIphone14ProMax);
        System.out.println(pixel7Pro.toString());
        System.out.println(iphone14ProMax.toString());
        System.out.println(pixel7Pro.modelName + " is equal to " + iphone14ProMax.modelName + "? " + pixel7Pro.equals(iphone14ProMax));
        Smartphone phoneClone;
        try{
            phoneClone = iphone14ProMax.clone();
            System.out.println("Dettagli del telefono clonato: " + phoneClone.toString());
            System.out.println(phoneClone.modelName + " is equal to " + iphone14ProMax.modelName + "? " + iphone14ProMax.equals(phoneClone));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }


}
