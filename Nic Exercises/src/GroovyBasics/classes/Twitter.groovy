package GroovyBasics.classes

Tweet t = new Tweet(title:"First Tweet", text:"New around here, what's up! :)")
t.charCount = t.text.length()
Tweet t2 = new Tweet(title:"Second Tweet", text:"I like it here, I think I'll stay! :)")
t2.charCount = t2.text.length()

t.tweetInfo()
t2.tweetInfo()