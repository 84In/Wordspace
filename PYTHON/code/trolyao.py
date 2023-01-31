import speech_recognition
from datetime import date
from datetime import datetime
import pyttsx3
robot_ear = speech_recognition.Recognizer()
engine = pyttsx3.init()
robot_brain = "" 
while True:
    with speech_recognition.Microphone() as mic:
        robot_brain = "I'm Listening"
        print("Robot: " + robot_brain)
        engine.say(robot_brain)
        engine.runAndWait()
        audio = robot_ear.listen(mic)
    print("Robot: ...")
    try:
        you = robot_ear.recognize_google(audio)
    except:
        you = ""

    print("You: " + you)

    if you == "":
        robot_brain = "I can't hear you, try again"
    elif "hello" in you:
        robot_brain = "Hello Tin"
    elif "today" in you:
        today = date.today()
        robot_brain = today.strftime("%B %d, %Y")
    elif "time" in you:
        now = datetime.now()
        robot_brain = now.strftime("%H hours %M minutes %S seconds")
    elif "bye" in you:
        robot_brain = "Bye Tin"
        print("Robot: " + robot_brain)
        engine.say(robot_brain)
        engine.runAndWait()
        break
    else:
        robot_brain= "I'm fine thank you and you"

    print("Robot: " + robot_brain)
    engine.say(robot_brain)
    engine.runAndWait()
