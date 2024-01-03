flex lexico.l
bison -t -d -v sintactico.y
gcc -o analizador sintactico.tab.c lex.yy.c
./analizador < pruebas.txt
