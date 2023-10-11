package hw1;

public class Electricity {
    public static void main(String[] args) {
        int m = 1;
        int ds = 121;
        int de = 1;
        double summerRateS1 = 1.63;
        double summerRateS2 = 2.38;
        double summerRateS3 = 3.52;
        double summerRateS4 = 4.8;
        double summerRateS5 = 5.66;
        double summerRateS6 = 6.41;
        double standardRateS1 = 1.63;
        double standardRateS2 = 2.1;
        double standardRateS3 = 2.89;
        double standardRateS4 = 3.94;
        double standardRateS5 = 4.6;
        double standardRateS6 = 5.03;
        double summerRateE1 = 2.53;
        double summerRateE2 = 3.55;
        double summerRateE3 = 4.25;
        double summerRateE4 = 6.43;
        double standardRateE1 = 2.12;
        double standardRateE2 = 2.91;
        double standardRateE3 = 3.44;
        double standardRateE4 = 5.05;
        double total = 0.0;

        if ( 6<=m && m<=9 || ds <= 120) {
            if (ds <= 120){
                total += ds * summerRateS1;
            } else if (ds <= 330) {
                total += 120 * summerRateS1;
                total += (ds-120) * summerRateS1;
            } else if (ds <= 500) {
                total += 120 * summerRateS1;
                total += (330-120) * summerRateS1;
                total += (ds-330) * summerRateS1;
            } else if (ds <= 700) {
                total += 120 * summerRateS1;
                total += (330-120) * summerRateS1;
                total += (500-330) * summerRateS1;
                total += (ds-500) * summerRateS1;
            } else if (ds <= 1000) {
                total += 120 * summerRateS1;
                total += (330-120) * summerRateS1;
                total += (500-330) * summerRateS1;
                total += (700-500) * summerRateS1;
                total += (ds-700) * summerRateS1;

            } else {
                total += 120 * summerRateS1;
                total += (330 - 120) * summerRateS1;
                total += (500 - 330) * summerRateS1;
                total += (700 - 500) * summerRateS1;
                total += (1000 - 700) * summerRateS1;
                total += (ds - 1000) * summerRateS1;
            }
        } else {
            if (ds <= 120) {
                total += ds * standardRateS1;
            } else if (ds <= 330) {
                total += 120 * standardRateS1;
                total += (ds - 120) * standardRateS2;
            } else if (ds <= 500) {
                total += 120 * standardRateS1;
                total += 210 * standardRateS2;
                total += (ds - 330) * standardRateS3;
            } else if (ds <= 700) {
                total += 120 * standardRateS1;
                total += 210 * standardRateS2;
                total += 170 * standardRateS3;
                total += (ds - 500) * standardRateS4;
            } else if (ds <= 1000) {
                total += 120 * standardRateS1;
                total += 210 * standardRateS2;
                total += 170 * standardRateS3;
                total += 200 * standardRateS4;
                total += (ds - 700) * standardRateS5;
            } else {
                total += 120 * standardRateS1;
                total += 210 * standardRateS2;
                total += 170 * standardRateS3;
                total += 200 * standardRateS4;
                total += 300 * standardRateS5;
                total += (ds - 1000) * standardRateS6;
            }
        }
        // industrial
        if ( 6<=m && m<=9 || de <= 330) {
            if (de <= 330){
                total += de * summerRateE1;
            } else if (de <= 700) {
                total += 330 * summerRateE1;
                total += (de-700) * summerRateE2;
            } else if (de <= 1500) {
                total += 330 * summerRateE1;
                total += (700-330) * summerRateE2;
                total += (de-700) * summerRateE3;
            } else {
                total += 330 * summerRateE1;
                total += (700-330) * summerRateE2;
                total += (1500-700) * summerRateE3;
                total += (de-1500) * summerRateE4;
            }

        } else {
            if (de <= 330){
                total += de * standardRateE1;
            } else if (de <= 700) {
                total += 330 * standardRateE1;
                total += (de-700) * standardRateE2;
            } else if (de <= 1500) {
                total += 330 * standardRateE1;
                total += (700-330) * standardRateE2;
                total += (de-700) * standardRateE3;
            } else {
                total += 330 * standardRateE1;
                total += (700-330) * standardRateE2;
                total += (1500-700) * standardRateE3;
                total += (de-1500) * standardRateE4;
            }
        }
        System.out.println("fee：" + total);
    }

}
