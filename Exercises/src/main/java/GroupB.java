
public class GroupB {


//    Sa se implementeze un calculator ce citeste de la tastatura operatiile si returneaza rezultatul acestora.
//    Operatii suportate: adunare, scadere, inmultire, impartire, ridicare la putere(^)

    public static void main(String[] args) {
        Calculator("99.4@2.1");
    }

    public static double Calculator(String expression) {

        String toBeSplited = expression;
        double result = 0.0;

        if (expression.contains("+")) {
            String[] parts = toBeSplited.split("\\+");

            double part1 = Double.valueOf(parts[0]);
            double part2 = Double.valueOf(parts[1]);
            result = (part1 + part2);
            System.out.println("The result is --> " + result);
        } else if (expression.contains("-")) {
            String[] parts = toBeSplited.split("-");
            double part1 = Double.valueOf(parts[0]);
            double part2 = Double.valueOf(parts[1]);
            result = (part1 - part2);
            System.out.println("The result is --> " + result);
        } else if (expression.contains(":") || expression.contains("/")) {
            String[] parts = toBeSplited.split("[\\/\\:]");
            double part1 = Double.valueOf(parts[0]);
            double part2 = Double.valueOf(parts[1]);
            result = (part1 / part2);
            System.out.println("The result is --> " + result);
        } else if (expression.contains("*")) {
            String[] parts = toBeSplited.split("\\*");
            double part1 = Double.valueOf(parts[0]);
            double part2 = Double.valueOf(parts[1]);
            result = (part1 * part2);
            System.out.println("The result is --> " + result);
        } else if (expression.contains("^")) {
            String[] parts = toBeSplited.split("\\^");
            double part1 = Double.valueOf(parts[0]);
            double part2 = Double.valueOf(parts[1]);
            result = Math.pow(part1, part2);
            System.out.println("The result is --> " + result);
        }
        else {
            System.out.println("Invalid");
        }
       return result;
    }

}
