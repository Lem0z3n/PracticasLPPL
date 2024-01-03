%{
#include <stdio.h>
#include<stdlib.h>
#include<string.h>
%}

%%
[A-Z]{2}  { printf("Matched two upper case letters: %s\n", yytext); }
%%

int main(int argc, char** argv)
{
    yylex();
    return 0;
}
