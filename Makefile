JAVA=javac

compile:
	${JAVA} Main.java && ${JAVA} objects/*.java

rm:
	find . -name "*.class" -type f -delete

run:
	java Main.java