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