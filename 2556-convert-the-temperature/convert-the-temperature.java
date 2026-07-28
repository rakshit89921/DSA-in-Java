class Solution {
    public double[] convertTemperature(double celsius) {

        double toKelvin = celsius + 273.15;
        double toFaren = celsius *1.80 + 32.00;

        return new double[] {toKelvin,toFaren};

        


        
    }
}