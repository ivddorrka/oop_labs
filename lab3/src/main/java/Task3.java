import java.util.Scanner;
import java.util.Arrays;

class House {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double area;
    private double numberOfFloors;

    public static House createFromText(String text) {
        String[] splitStr = text.split("\\s+");
        House h_1 = new House();

        if(splitStr[0].equals("<span")){
            String[] splitStr1 = text.split("Beds");
            h_1.numberOfBedrooms = Character.getNumericValue(splitStr1[0].charAt(splitStr1[0].length()-2));
            String[] splitStr2 = text.split("Baths");
            h_1.numberOfBathrooms = Character.getNumericValue(splitStr2[0].charAt(splitStr2[0].length()-2));
            String[] splitStr3 = text.split(" SqFt");
            h_1.area = Double.parseDouble(splitStr3[0].split(">")[splitStr3[0].split(">").length-1]);
            String[] splitStr4 = text.split("-story");
            h_1.numberOfFloors = Character.getNumericValue(splitStr4[0].charAt(splitStr4[0].length() - 1));

        }else if(splitStr[0].equals("Name:")){
            String[] splitStr1 = text.split("Beds: ");
            h_1.numberOfBedrooms = Character.getNumericValue(splitStr1[1].charAt(0));
            String[] splitStr2 = text.split("Baths: ");
            h_1.numberOfBathrooms = Character.getNumericValue(splitStr2[1].charAt(0));
            String[] splitStr3 = text.split("SqFt");
            h_1.area = Double.parseDouble(splitStr3[0].split("\\s+")[splitStr3[0].split("\\s+").length-1]);
            String[] splitStr4 = text.split("Two+");
            h_1.numberOfFloors = 2.5;
        }else{
            String[] splitStr3 = text.split(" sq");
            String  numbbjksd = splitStr3[0].split("\\s+")[splitStr3[0].split("\\s+").length-1];
            String tru_val = numbbjksd.replace(",", "");
            h_1.area = Double.parseDouble(tru_val);
            String[] splitStr1 = text.split("\\sbedrooms?");
            int b = Character.getNumericValue(splitStr1[0].charAt(splitStr1[0].length()-1));
            h_1.numberOfBedrooms = b;
            String[] splitStr2 = text.split("\\sbathrooms?");
            int c = Character.getNumericValue(splitStr2[0].charAt(splitStr2[0].length()-1));
            h_1.numberOfBathrooms = c;
            String[] splitStr4 = text.split("-?\\s?story");

            if(splitStr4[0].charAt(splitStr4[0].length()-1)!=1){
                h_1.numberOfFloors = 1;
            }else{
                int a = Character.getNumericValue(splitStr4[0].charAt(splitStr4[0].length() - 1));
                h_1.numberOfFloors = a;
            }


        }

        return h_1;

    }
    @Override
    public String toString(){
        return "House{numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", area=" + area + ", numberOfFloors=" + numberOfFloors + "}";
    }
}



public class Task3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        String text = sc.nextLine();
        String text = "<span style=\"padding-top: 5px;display:inline-block;\">3 Beds</span><span style=\"padding-top: 5px;display:inline-block;\">2 Baths</span><span style=\"padding-top: 5px;display:inline-block;\">2 Baths</span><span style=\"padding-top: 5px;display:inline-block;\">1959 SqFt</span>This elegant 1-story is soaring with 11-foot ceilings and a spacious floor plan!\n";
        System.out.println(House.createFromText(text));
    }
}

