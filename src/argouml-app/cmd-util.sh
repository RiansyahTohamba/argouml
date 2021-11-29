# versi 1.8
java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
-source src/org/argouml/util src/org/argouml/configuration src/org/tigris \
src/Acme/JPM/Encoders \
-lib /usr/lib/jvm/java-8-openjdk-amd64/ ~/.gradle/ \
-output refactoring.sqlite -JV 1.8

# versi 1.5
#java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
#-source src/org/argouml/util src/org/argouml/configuration src/org/tigris \
#src/Acme/JPM/Encoders \
#-lib /usr/lib/jvm/jdk1.5.0_22 ~/.gradle/ \
#-output refactoring.sqlite -JV 1.5

# versi 1.5 dan isolated
# kode ini berhasil. kenapa ya?
# java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
# -source src/org/argouml/util/isolated \
# -lib /usr/lib/jvm/jdk1.5.0_22 ~/.gradle/ \
# -output refactoring.sqlite -JV 1.5