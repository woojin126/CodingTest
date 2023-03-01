# CodingTest

## 코딩테스트 정리 블로그

https://woojin126.tistory.com/category/%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8


## 1.문자 찾기문제 (FindLetter)

설명

한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

입력
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.

문자열은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 해당 문자의 개수를 출력한다.


예시 입력 1

Computercooler
c

풀이: 입력받는 문자와 단어를 모두 lowercase 로 해준다음 일치하는 문자 개수를 카운팅


## 2. 대소문자 변환 (CaseConversion)
   설명

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

문자열은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.


예시 입력 1

StuDY
예시 출력 1

sTUdy

TIP) 아스킾코드 대문자는 65~90 , 소문자는 97~122 를사용하는 방법

        for (char x : str.toCharArray()) {
            if (x >= 65 && x <= 90) {
                answer.append((char)(x + 32));
            } else {
                answer.append((char)(x - 32));
            }
        }



## 3. 문장 속 단어
   설명

한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

문장속의 각 단어는 공백으로 구분됩니다.


입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

단어를 답으로 합니다.


예시 입력 1

it is time to study
예시 출력 1

study

``` 풀이1
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String o, String o2) {
        if (o.getBytes().length >= o2.getBytes().length)
            return o;
        else return o2;
    }
}
public class Main {
    public static String BestLongOfLength(String text) {
        String[] seperateText = text.split(" ");
        return Arrays.stream(seperateText).reduce(new CompareString()).get();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String s = Main.BestLongOfLength(txt);
        System.out.println(s);
    }
}
```

``` 풀이2
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String BestLongOfLength(String text) {
        String answer = "";
        int pos, m = Integer.MIN_VALUE;

        while((pos = text.indexOf(' ')) != -1) {
            String tmp = text.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m=len;
                answer = tmp;
            }
            text = text.substring(pos+1);
        }

        if (text.length() > m) answer=text;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String s = Main.BestLongOfLength(txt);
        System.out.println(s);
    }
}


```

## 4. 단어 뒤집기
   설명

N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


예시 입력 1

3
good
Time
Big
예시 출력 1

doog
emiT
giB

```


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String convertName(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        return sb.reverse().toString();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0 ; i<num; i++) {
            String text = sc.next();
            System.out.println(convertName(text));
        }
    }
}

```


## 5. 특정 문자 뒤집기
   설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


예시 입력 1

a#b!GE*T@S
예시 출력 1

S#T!EG*b@a

```
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String reverseString(String name) {
        String answer = "";
        int firstIndex = 0;
        int lastIndex = name.length()-1;
        char[] s = name.toCharArray();
        while (firstIndex < lastIndex) {
            if (!((s[firstIndex] >= 'A' && s[firstIndex] <= 'Z') || (s[firstIndex] >= 'a' && s[firstIndex] <= 'z'))) firstIndex++;
            else if (!((s[lastIndex] >= 'A' && s[lastIndex] <= 'Z') || (s[lastIndex] >= 'a' && s[lastIndex] <= 'z'))) lastIndex--;
            else {
                char tmp = s[firstIndex];
                s[firstIndex] = s[lastIndex];
                s[lastIndex] = tmp;
                firstIndex++;
                lastIndex--;
            }

            answer =  String.valueOf(s);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(reverseString(text));
    }
}


```