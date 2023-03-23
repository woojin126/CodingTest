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


## 6. 중복문자제거
   설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.


예시 입력 1

ksekkset
예시 출력 1

kset
```
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static String removeDuplicate(String name) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        char[] s = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (!list.contains(s[i])) {
                answer.append(s[i]);
            }
            list.add(s[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String s = removeDuplicate(text);
        System.out.println(s);
    }
}


```

## 7. 회문 문자열
   설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.


예시 입력 1

gooG
예시 출력 1

YES

``` 첫풀이
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static boolean solution(String s) {
        boolean status = false;
        String aCase = s.toLowerCase();
        int max = aCase.length() - 1;
        for (int i = 0 ; i < aCase.length()/2 ;i++) {
            if (aCase.charAt(i) == aCase.charAt(max)) {
                status = true;
                max--;
            }
            else {
                status = false;
                break;
            }
        }
        return status;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        if (solution(text)) System.out.println("YES");
        else System.out.println("NO");
    }
}


```

``` 두번째 풀이 

public class Main {
    public static String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverseString = stringBuilder.reverse().toString();
        if (s.equalsIgnoreCase(reverseString)) return "YES";
        else return "NO";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String result = solution(text);
        System.out.println(result);
    }
}

```
## 8. 유효한 팰린드롬
   설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.


예시 입력 1

found7, time: study; Yduts; emit, 7Dnuof
예시 출력 1

YES

``` 첫번째 풀이
import java.util.*;
class Main {
    public String solution(String str){
        String result = "";
        String lowerStr = str.toLowerCase();
        for(char s : lowerStr.toCharArray()) {
            if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
                result += s;
            }
        }
        String answer = result.trim();
        String reverseAnswer = new StringBuilder(answer).reverse().toString();

        if (answer.equals(reverseAnswer)) return "YES";
        else return "NO";
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
} 
```

``` 두번째 방법

class Main {
    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
} 

```


``` 첫번째 풀이

class Main {
    public int solution(String str){
        String upperCase = str.toUpperCase();

        String result = upperCase.replaceAll("[A-Z]", "");

        int answer = Integer.parseInt(result);

        return answer;

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}

``` 
``` 두번쨰 풀이
아스킾 넘버를 이용

import java.util.*;
class Main {
    public int solution(String str){
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) answer = answer*10+(c-48);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}


```

``` 세번째 풀이는 Character.isDigit 메서드를 이용하여 숫자인지 문자인지 판별

import java.util.*;
class Main {
    public int solution(String str){
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) answer+=c;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}

```
10. ## 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0

``` 
import java.util.*;
class Main {
    public int[] solution(String s, char t){
        int[] arr = new int[s.length()];

        int defaultValue = 150;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == t) {
                defaultValue = 0;
                arr[i] = defaultValue;
            } else {
                defaultValue++;
                arr[i] = defaultValue;
            }
        }

        defaultValue = 150;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) defaultValue = 0;
            else {
                defaultValue++;
                arr[i] = Math.min(arr[i], defaultValue);
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String[] s = kb.nextLine().split(" ");
       for (int x : T.solution(s[0], s[1].charAt(0))) {
           System.out.print(x+" ");
       }
    }
}

1. 왼 -> 오른쪽 스캔 왼쪽 e를 기준으로 스캔
2. 오  -> 왼쪽 스캔 오른쪽 e 를 기준으로 스캔.
3. 1,2 에서 나타낸 거리를 비교해 숫자가 낮은것이 가장 최단거리.

p를 = 1000으로 셋팅하는이유는
teachermode e 예제에서 
1-1. 왼쪽 e를기준으로 ach 의 거리를계산.
2-2. 오른쪽 e를 기준으로 ach를 계산하여 비교를하는데 있어서

핵심 > 
맨앞 t 는 1.1 예시에 대입을해본다면 왼쪽 e를 기준으로 계산할 거리가 없기떄문에 큰값을 설정해두고 
2-2를 계산후  1.1 과 2.2를 비교했을떄 2.2의 값이 출력되도록하기 위한 것이다.  


```
## 11. 문자열 압축
    설명    s = s + " "; 이렇게한이유. outOfStrange 문제로 임의로 한칸더 늘림 ~. 다른 문제는 없으며 쉽게 이해할 수 있음.

알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

단 반복횟수가 1인 경우 생략합니다.


입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 압축된 문자열을 출력한다.


예시 입력 1

KKHSSSSSSSE
예시 출력 1

K2HS7E
예시 입력 2

KSTTTSEEKFKKKDJJGG
예시 출력 2

KST3SE2KFK3DJ2G2
```
class Main {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 1;
        s = s + " ";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else if (count == 1) {
                answer.append(s.charAt(i));
            } else {
                answer.append(s.charAt(i));
                answer.append(count);
                count = 1;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(solution(s));
    }
}


```


## 12. 암호
    설명

현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.

비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.

비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.

만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.

1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.

2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.

3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.

참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.

현수가 4개의 문자를 다음과 같이 신호로 보냈다면

#****###**#####**#####**##**

이 신호를 4개의 문자신호로 구분하면

#****## --> 'C'

#**#### --> 'O'

#**#### --> 'O'

#**##** --> 'L'

최종적으로 “COOL"로 해석됩니다.

현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.


입력
첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.

현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.


출력
영희가 해석한 문자열을 출력합니다.


예시 입력 1

4
#****###**#####**#####**##**
예시 출력 1

COOL

```
import java.util.*;

class Main {
        public static String solution(String s, int n) {
            String answer = "";
            for (int i = 0 ; i < n ; i++) {
                String value = s.substring(0, 7).replace('#', '1').replace('*', '0');

                int count = 0;
                int sum = 0;
                //십진수 변환
                for (int j=value.length()-1; j >= 0 ;j--) {
                    sum += Integer.parseInt(String.valueOf(value.charAt(j))) * Math.pow(2, count);
                    count++;
                }

                answer += (char)sum;
                s = s.substring(7);

            }
            return answer;
        }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        String s = kb.next();
        System.out.println(solution(s,a));
    }
}


```

# Array 파트

## 2.큰 수 출력하기
   설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


예시 입력 1

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12

``` 
import java.util.*;

class Main {
    public static List<Integer> solution(int[] input) {
        List<Integer> list = new ArrayList<>();
        list.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1])
                list.add(input[i]);

        }
        return list;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }
}

```


## 2. 보이는 학생
   설명

선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


출력
선생님이 볼 수 있는 최대학생수를 출력한다.


예시 입력 1

8
130 135 148 140 145 150 150 153
예시 출력 1

5

```
import java.util.*;

class Main {
    public static int solution(int[] input) {
        int count = 1;
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                count++;
                max = input[i];
            }

        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(arr);
        System.out.println(solution);
    }
}


```

## 3. 가위 바위 보
   설명

A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

예를 들어 N=5이면

Image1.jpg

두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.

세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.


출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.


예시 입력 1

5
2 3 3 1 3
1 1 2 2 3
예시 출력 1

A
B
A
B
D

``` 
간단한 가위바위보
import java.util.*;
class Main {
    public static String solution(int[] a, int[] b) {
        String answer = "";
        for (int i = 0 ; i < a.length ;i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println(solution(A,B));


    
}
```

``` bufferedReader 사용 및 다른풀이법


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    public static String solution(int a, int b) {
        if (a==b) return "D";

        if (a==1 && b==3) return "A";
        else if (a==2 && b==1) return "A";
        else if (a==3 && b==2) return "A";
        else return "B";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer A = new StringTokenizer(br.readLine());
        StringTokenizer B = new StringTokenizer(br.readLine());

        while (N != 0) {
            N--;
            System.out.println(solution(Integer.parseInt(A.nextToken()),Integer.parseInt(B.nextToken())));
        }

    }
}


```

## 4. 피보나치 수열
   설명

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력
첫 줄에 피보나치 수열을 출력합니다.


예시 입력 1

10
예시 출력 1

1 1 2 3 5 8 13 21 34 55

```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static int[] solution(int N) {
        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2 ; i < N ; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] solution = solution(N);

        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
```

## 5. 소수(에라토스테네스 체)
   설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.


예시 입력 1

20
예시 출력 1

8
``` 소수 개수구하기 (에라토스테네스의 체 사용)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static int solution(int N) {
        boolean[] arr = new boolean[N+1];
        
        // 0,1 번째 인덱스는 true로 초기화
        arr[0] = true;
        arr[1] = true;

        //2. 2부터 시작해서 특정 수의 배수에 해당하는 수는 모두 지운다.
        // (지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너 뛴다.)
        for (int i = 2 ; i <= N ; i++) {
            if (arr[i]) continue;

            //이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            for (int j = 2 * i ; j <= N ; j+=i) {
                arr[j] = true;
            }
        }
        
        //남아있는수 모두 출력 (소수) false인 값
        int answer = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            if (!arr[i]) answer++;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }
}
```

## 6. 뒤집은 소수
   설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1

9
32 55 62 20 250 370 200 30 100
예시 출력 1

23 2 73 2 3

``` 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

//입력받은 문자를 역순으로 바꾸는 메서드
    public static int reverseOrder(int N) {
        int t = N;
        int nm;
        StringBuilder answer = new StringBuilder();
        while (t != 0) {
            nm = t % 10;
            t = t/10;

            answer.append(nm);
        }

        return Integer.parseInt(String.valueOf(answer));

    }

//소수판별 메서드
    public static boolean isPrime(int p) {
        if (p == 1) return false;
        for (int i = 2; i<= (int)Math.sqrt(p) ; i++) {
            if (p % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        st = new StringTokenizer(s);
        StringBuilder answer = new StringBuilder();
        while (st.hasMoreTokens()) {
            //역순처리
            int solution = reverseOrder(Integer.parseInt(st.nextToken()));
            //소수판별
            if (isPrime(solution)) {
                answer.append(solution);
                answer.append(" ");
            }
        }
        System.out.println(answer);
    }
}


두번째 조금더 간결해진 풀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static ArrayList<Integer> solution(int N) {
        ArrayList<Integer> answer = new ArrayList<>();
        //입력값 역순
        int res = reverseOrder(N);
        //소수판별
        if (isPrime(res)) answer.add(res);
        return answer;

    }

    private static int reverseOrder(int N) {
        int nm;
        int res = 0;
        while (N != 0) {
            nm = N % 10;
            res = res * 10 + nm;
            N = N / 10;
        }
        return res;
    }

    public static boolean isPrime(int p) {
        if (p == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(p); i++) {
            if (p % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            ArrayList<Integer> list = solution(Integer.parseInt(st.nextToken()));
            for (Integer result : list) {
                System.out.print(result + " ");
            }
        }

    }
}
```
## 7. 점수계산
   설명

OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.

여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서 다음과 같이 점수 계산을 하기로 하였다.

1번 문제가 맞는 경우에는 1점으로 계산한다. 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.

또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다. 틀린 문제는 0점으로 계산한다.

예를 들어, 아래와 같이 10 개의 OX 문제에서 답이 맞은 문제의 경우에는 1로 표시하고, 틀린 경우에는 0으로 표시하였을 때,

점수 계산은 아래 표와 같이 계산되어, 총 점수는 1+1+2+3+1+2=10 점이다.

Image1.jpg

시험문제의 채점 결과가 주어졌을 때, 총 점수를 계산하는 프로그램을 작성하시오.


입력
첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.

0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.


출력
첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력한다.


예시 입력 1

10
1 0 1 1 1 0 0 1 1 0
예시 출력 1

10

``` 
class Main {
    public static int solution(int[] N) {
        int value = 0;
        int sum = 0;
        for (int i = 0; i < N.length ; i++) {
            if (N[i] == 0) {
                sum = 0;
            } else {
                value += ++sum;
            }
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] value = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(value));

    }
}
키포인트는 0을 만나는순간 증감값인 sum을 초기화

```

## 8. 등수구하기
   설명

N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.

같은 점수가 입력될 경우 높은 등수로 동일 처리한다.

즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

입력
첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.

출력
입력된 순서대로 등수를 출력한다.

예시 입력 1

5
87 89 92 100 76
예시 출력 1

4 3 2 1 5

``` 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main {
    public static int[] solution(int[] N) {
        int[] answer = new int[N.length];
        for (int i=0 ; i<N.length ; i++) {
            int grade=N.length;
            for (int j=0; j<N.length ; j++) {
                if (i==j) continue;
                if (N[i] >= N[j]) grade--;
            }

            answer[i] = grade;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] value = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        int[] solution = solution(value);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}

```

## 9. 격자판 최대합
   설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.


예시 입력 1

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
예시 출력 1

155
```
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static int solution(int[][] arr) {

        int max = 0;
        int sum, sum2;
        for (int i = 0 ; i < arr[0].length ; i++) {
            sum=sum2=0;
            for (int j = 0 ; j < arr.length ; j++) {
                sum += arr[i][j];
                sum2 += arr[j][i];
            }

            int bi = Math.max(sum, sum2);
            if (bi > max) max = bi;
        }

        sum=sum2=0;
        for (int i = 0; i < arr[0].length ;i++) {
            sum += arr[i][i];
            sum2 += arr[i][i];
        }
        int answer = Math.max(max, Math.max(sum, sum2));
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N ;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}


```

## 10. 봉우리
    설명

지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.

각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.

격자의 가장자리는 0으로 초기화 되었다고 가정한다.

만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

Image1.jpg


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
봉우리의 개수를 출력하세요.


예시 입력 1

5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
예시 출력 1

10

``` 
봉우리 첫풀이
각 인덱스에서 상하좌우를 비교하는데있어서 (0,0) 같은경우 (-1,0) (0,-1) 와 비교하게되면 boundException이 발생하기때문에,
입력받은 값을 제외하고 배열의 주면은 0으로 채워넣어서 풀이. 

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static int solution(int[][] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N + 2][N + 2];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int solution = solution(arr);
        System.out.println(solution);

    }
}

```

``` 
봉우리 두번째 풀이
변수 dx,dy로 상하좌우 를 배열로 만들어두고 시작.

import java.io.IOException;
import java.util.Scanner;

class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = dx[k] + i;
                    int ny = dy[k] + j;

                    if (nx >= 0 && nx < arr[0].length && ny >= 0 && ny < arr[0].length && arr[nx][ny] > arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int solution = solution(arr);
        System.out.println(solution);

    }
}
```