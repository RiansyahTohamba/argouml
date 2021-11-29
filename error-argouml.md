error-argouml.md

# harus load maven dulu
sehingga kelas yg belum solve jadi solve!
sudah di run! success

# Main class nya dimana?


# jika sudah selesai load maven
jalankan kode berikut
`cd /media/riansyah/Windows-SSD/Users/LENOVO/projects/argouml/src/argouml-app`

`java -jar ../../../JCodeOdor-Launcher-1.0-standalone.jar -source src/ -lib /usr/lib/jvm/java-8-openjdk-amd64/ ~/.gradle/ -output refactoring.sqlite -JV 1.8 `
# error building
  <dependency>
      <groupId>org.tigris.gef</groupId>
      <artifactId>gef</artifactId>
      <version>0.13.7</version>
      <scope>compile</scope>
    </dependency>

## org.tigris.gef sudah tidak terdeteksi di maven?
betul sekali!
org.tigris kini hanya memiliki 2 hasil pencarian di maven
`
1. Subclipse SVN Client Adapter12 usages
   org.tigris » svn-client-adapterApache

WSO2 Packaged svn client adapter
Last Release on Jun 19, 2015

2. MARC4J
   org.tigris » marc4j

Manipulate MARC data with java; fork of marc4j by Bas Peters
Last Release on Jul 16, 2010
`
mari kita ganti dengan


# error jcodeodor
[MetricDetector][ERROR]: The type FigObject must implement the inherited abstract method 
MouseListener.mouseReleased(MouseEvent) - in file: /media/riansyah/Windows-SSD/Users/LENOVO/projects/argouml/src/argouml-app/src/org/argouml/uml/diagram/deployment/ui/FigObject.java - at line: 60

[MetricDetector][ERROR]: Fig cannot be resolved to a type - in file: /media/riansyah/Windows-SSD/Users/LENOVO/projects/argouml/src/argouml-app/src/org/argouml/uml/diagram/ui/FigCompartment.java - at line: 137

[MetricDetector][ERROR]: The method isFilled() of type FigJoinState must override or implement a supertype method - in file: /media/riansyah/Windows-SSD/Users/LENOVO/projects/argouml/src/argouml-app/src/org/argouml/uml/diagram/state/ui/FigJoinState.java - at line: 169
