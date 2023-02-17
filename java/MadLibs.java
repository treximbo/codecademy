public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Laura
    Date: 2/19/2049
    */
    public static void main(String[] args){
        String name1 = "Tyler";
        String name2 = "Megan";
        String adjective1 = "blue";
        String adjective2 = "heavy";
        String adjective3 = "bright";
        String verb1 = "fell";
        String noun1 = "building";
        String noun2 = "ball";
        String noun3 = "mattress";
        String noun4 = "statue";
        String noun5 = "window";
        String noun6 = "relic";
        String place1 = "Yemen";
        int number = 23;

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
