# java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
# -source src/org/argouml/uml/cognitive \
# \
# -lib /usr/lib/jvm/java-8-openjdk-amd64/  \
# -output refactoring.sqlite -JV 1.8

java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
-source src/org/argouml/uml/cognitive/isolated \
\
-lib /usr/lib/jvm/java-8-openjdk-amd64/  \
-output test.sqlite -JV 1.8


# /media/riansyah/Windows-SSD/Users/LENOVO/projects/argouml/src/argouml-core-model/src/org/argouml/model/Model.java
# untuk buat file class yg dibutuhkan untuk di-isolated
# touch src/org/argouml/uml/cognitive/isolated/Model.java

# lalu
# find import org.argouml.model.Model;
# replace import org.argouml.uml.cognitive.isolated.Model;

# tetapi terdapat 100 file yg butuh model.Model?
# apakah direktori dan nama package bisa berbeda?
# mari test?