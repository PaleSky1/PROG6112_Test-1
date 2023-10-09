package camerapricecomparison;
public class CameraPriceComparison {
    public static void main(String[] args) {
        //Camera manufacturers and their camera prices for Mirrorless and DSLR
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] cameraPrices = {
            {10500, 8500}, // CANON
            {9500, 7200},  // SONY
            {12000, 8000}  // NIKON
        };

        //Initialize variables to keep track of the greatest cost difference and its manufacturer
        int greatestDifference = 0;
        String greatestDifferenceManufacturer = "";

        System.out.println("-----------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-----------------------------------------");
        System.out.println("\tMIRRORLESS\tDSLR");

        //Loop through the manufacturers and their camera prices
        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;

            System.out.println(manufacturer + "\tR " + mirrorlessPrice + ".00 \tR " + dslrPrice + ".00");

            //Check if this manufacturer has the greatest cost difference
            if (priceDifference > greatestDifference) {
                greatestDifference = priceDifference;
                greatestDifferenceManufacturer = manufacturer;
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("-----------------------------------------");

        //Loop through the manufacturers again to display the results
        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;

            System.out.print(manufacturer + "\tR " + priceDifference + ".00");

            //Check if this manufacturer has a cost difference greater or equal to 2500
            if (priceDifference >= 2500) {
                System.out.print(" ***");
            }

            System.out.println();
        }

        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE : " + greatestDifferenceManufacturer);
        System.out.println("-----------------------------------------");
    }
}

