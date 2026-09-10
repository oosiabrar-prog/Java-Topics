package ControlStatement;

public class findword {

        public static void main(String[] args) {
            String p = "Java is a great language. Many developers love java because JAVA is powerful.";
            String W = "great";


            String[] word = p.replaceAll(",./;?", "").split(" ");
            int count = 0;


            for (int i = 0; i < word.length; i++) {

                if (word[i].equalsIgnoreCase(W)) {
                    count++;
                    System.out.println("Match found: '" + word[i] + "' at word position " + (i+1));
                }
            }
            if(count>0){

                System.out.println("Total occurrences found: " + count);
            }
            else{
                System.out.println("Word not Found");
            }

        }
}

