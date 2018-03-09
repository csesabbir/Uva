import java.util.Scanner;

public class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		while(sc.hasNext())
		{
			str=sc.nextLine();
			String str1="";
			for(int i=0;i<str.length();i++)
			{
				switch(str.charAt(i))
				{
				case '4':
					str1+='q';
					break;
				case '5':
					str1+='j';
					break;
				case '6':
					str1+='l';
					break;
				case '7':
					str1+='m';
					break;
				case '8':
					str1+='f';
					break;
				case '9':
					str1+='p';
					break;
				case '0':
					str1+='/';
					break;
				case '-':
					str1+='[';
					break;
				case '=':
					str1+=']';
					break;
				case '$':
					str1+='Q';
					break;
				case '%':
					str1+='J';
					break;
				case '^':
					str1+='L';
					break;
				case '&':
					str1+='M';
					break;
				case '*':
					str1+='F';
					break;
				case '(':
					str1+='P';
					break;
				case ')':
					str1+='?';
					break;
				case '_':
					str1+='{';
					break;
				case '+':
					str1+='}';
					break;
				case 'q':
					str1+='4';
					break;
				case 'w':
					str1+='5';
					break;
				case 'e':
					str1+='6';
					break;
				case 'r':
					str1+='.';
					break;
				case 't':
					str1+='o';
					break;
				case 'y':
					str1+='r';
					break;
				case 'u':
					str1+='s';
					break;
				case 'i':
					str1+='u';
					break;
				case 'o':
					str1+='y';
					break;
				case 'p':
					str1+='b';
					break;
				case '[':
					str1+=';';
					break;
				case ']':
					str1+='=';
					break;
				case 'Q':
					str1+='$';
					break;
				case 'W':
					str1+='%';
					break;
				case 'E':
					str1+='^';
					break;
				case 'R':
					str1+='>';
					break;
				case 'T':
					str1+='O';
					break;
				case 'Y':
					str1+='R';
					break;
				case 'U':
					str1+='S';
					break;
				case 'I':
					str1+='U';
					break;
				case 'O':
					str1+='Y';
					break;
				case 'P':
					str1+='B';
					break;
				case '{':
					str1+=':';
					break;
				case '}':
					str1+='+';
					break;
				case 'a':
					str1+='7';
					break;
				case 's':
					str1+='8';
					break;
				case 'd':
					str1+='9';
					break;
				case 'f':
					str1+='a';
					break;
				case 'g':
					str1+='e';
					break;
				case 'h':
					str1+='h';
					break;
				case 'j':
					str1+='t';
					break;
				case 'k':
					str1+='d';
					break;
				case 'l':
					str1+='c';
					break;
				case ';':
					str1+='k';
					break;
				case '\'':
					str1+='-';
					break;
				case 'A':
					str1+='&';
					break;
				case 'S':
					str1+='*';
					break;
				case 'D':
					str1+='(';
					break;
				case 'F':
					str1+='A';
					break;
				case 'G':
					str1+='E';
					break;
				case 'J':
					str1+='T';
					break;
				case 'K':
					str1+='D';
					break;
				case 'L':
					str1+='C';
					break;
				case ':':
					str1+='K';
					break;
				case '"':
					str1+='_';
					break;
				case 'z':
					str1+='0';
					break;
				case 'x':
					str1+='z';
					break;
				case 'c':
					str1+='x';
					break;
				case 'v':
					str1+=',';
					break;
				case 'b':
					str1+='i';
					break;
				case 'n':
					str1+='n';
					break;
				case 'm':
					str1+='w';
					break;
				case ',':
					str1+='v';
					break;
				case '.':
					str1+='g';
					break;
				case '/':
					str1+='\'';
					break;
				case 'Z':
					str1+=')';
					break;
				case 'X':
					str1+='Z';
					break;
				case 'C':
					str1+='X';
					break;
				case 'V':
					str1+='<';
					break;
				case 'B':
					str1+='I';
					break;
				case 'N':
					str1+='N';
					break;
				case 'M':
					str1+='W';
					break;
				case '<':
					str1+='V';
					break;
				case '>':
					str1+='G';
					break;
				case '?':
					str1+='"';
					break;
				default:
						str1+=str.charAt(i);
						break;
						
				}
				
			}
			System.out.println(str1);
			
		}
		sc.close();
	}
}