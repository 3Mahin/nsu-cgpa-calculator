package cgpa_calculator.nsu_cgap_calculator;

public class Calculations {

    double[] courseGrades = new double[5];
    double[] courseCredits = new double[5];

    String grade = "";
    double totalCred = 0;
    double sum = 0;

    Calculations(String[] credits, String[] grades){
        for(int i=0; i<5; i++){
            courseCredits[i] = Double.parseDouble(credits[i]);
        }
        for(int i=0; i<5; i++){
            grade = grades[i];

            switch (grade){
                case "A":
                    courseGrades[i] = 4.0;
                    break;
                case "A-":
                    courseGrades[i] = 3.7;
                    break;
                case "B+":
                    courseGrades[i] = 3.3;
                    break;
                case "B":
                    courseGrades[i] = 3.0;
                    break;
                case "B-":
                    courseGrades[i] = 2.7;
                    break;
                case "C+":
                    courseGrades[i] = 2.3;
                    break;
                case "C":
                    courseGrades[i] = 2.0;
                    break;
                case "C-":
                    courseGrades[i] = 1.7;
                    break;
                case "D+":
                    courseGrades[i] = 1.3;
                    break;
                case "D":
                    courseGrades[i] = 1.0;
                    break;
                case "F":
                case "I":
                case "W":
                case "R":
                default:
                    courseGrades[i] = 0.0;
                    break;
            }
        }

    }

    double calc(){
        for(int i=0; i<courseCredits.length;i++){
            totalCred+=courseCredits[i];
        }

        for(int i=0; i<courseCredits.length; i++){
            sum += courseCredits[i] * courseGrades[i];
        }

        return sum/totalCred;
    }


}