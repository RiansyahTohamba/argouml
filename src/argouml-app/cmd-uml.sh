java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
-source src/org/argouml/uml \
src/org/tigris src/org/argouml/i18n \
-lib /usr/lib/jvm/java-8-openjdk-amd64/  \
-output refactoring.sqlite -JV 1.8


# jika src/org/argouml/ui produce error lebih banyak, maka gunakan versi isolasi
	# hasilnya? (banyak) error di folder /argouml/ui
	# berarti isolasi



# jika i18n produce error lebih banyak, maka gunakan versi isolasi
	# ga ada error di folder i18n
	# berarti aman, urus error yang lain dulu

# error yg dihasilkan sama, perhatikan lagi error yg mungkin terjadi?
# 3 error itu terjadi karena direktori yang dimaksud tidak ditemukan

