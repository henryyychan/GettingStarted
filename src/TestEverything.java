public class TestEverything {
    public static void main (String[] args){
        System.out.println("Testing DotCom.");

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        //SimpleDotCom theDotCom = new SimpleDotCom();
        DotCom theDotCom = new DotCom();
        // test class DotCom

        int randomNum = (int) (Math.random() * 5);
        System.out.println("The random number is " + randomNum + ".");

        theDotCom.setLocationCells(String.valueOf(randomNum));
        theDotCom.setLocationCells(String.valueOf(randomNum + 1));
        theDotCom.setLocationCells(String.valueOf(randomNum + 2));
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number:");
            String result = theDotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses to kill it.");
            }
        }

    }
}


