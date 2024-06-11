package GroovyBasics.classes
@groovy.transform.ToString

class Tweet {

    public String title
    public String text
    public int charCount

    //Constructor - NOT NEEDED IN GROOVY
    Tweet(){

    }

    void tweetInfo() {
        println "Tweet info:\nTitle: $title\nText: $text\nCharacter Count: $charCount"
    }
}
