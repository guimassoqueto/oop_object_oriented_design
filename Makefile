JAVA=javac

compile:
	${JAVA} Main.java && ${JAVA} sup/*.java sub/*.java

rm:
	find . -name "*.class" -type f -delete

run:
	java Main.java