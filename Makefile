JAVA=javac

compile:
	${JAVA} Main.java && ${JAVA} -d dist/ *.java