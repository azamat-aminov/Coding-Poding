class Solution {
    public double[] convertTemperature(double celsius) {
        System.out.println(celsius + 273.15);
        
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        
        double[] result = new double[2];
        result[0] = kelvin;
        result[1] = fahrenheit;
            
            return result;
    }
}