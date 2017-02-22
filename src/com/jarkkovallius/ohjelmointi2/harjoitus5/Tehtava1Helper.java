package com.jarkkovallius.ohjelmointi2.harjoitus5;

/**
 * Created by Jarkko on 7.2.2017.
 */
public class Tehtava1Helper {

    /**
     * Calculates person's BMI
     *
     * @param height person height in centimeters
     * @param weight person weight in kilograms
     * @return person's BMI
     */
    public static float calculateBMI(float height, float weight) {
        return weight / (height * height ) * 10000  ;
    }

}
