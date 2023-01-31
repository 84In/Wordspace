import pyttsx3

robot_brain = "I can't hear you, try again"

engine = pyttsx3.init()
engine.say(robot_brain)
engine.runAndWait()