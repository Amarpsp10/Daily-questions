# Daily-questions
<hr>
1. program to reverse an array -- 
       <a href="https://github.com/Amarpsp10/Daily-questions/blob/main/solutions/01.java">solution</a>
<hr>

2. Chef wants to host some Division-3 contests. Chef has N setters who are busy creating new problems for him. The ith setter has made Ai problems where 1≤i≤N.
  <br>   A Division-3 contest should have exactly K problems. Chef wants to plan for the next D days using the problems that they have currently. But Chef cannot host more than one      Division-3 contest in a day.
    Given these constraints, can you help Chef find the maximum number of Division-3 contests that can be hosted in these D days?<a    href="https://www.codechef.com/JAN21C/problems/DIVTHREE">(orignal question)</a> <br>
    --<a href="https://github.com/Amarpsp10/Daily-questions/blob/main/solutions/02.java">solution</a>
 <hr>

3. An encoder encodes the first 16 lowercase English letters using 4 bits each. The first bit (from the left) of the code is 0 if the letter lies among the first 8 letters, else it is 1, signifying that it lies among the last 8 letters. The second bit of the code is 0 if the letter lies among the first 4 letters of those 8 letters found in the previous step, else it's 1, signifying that it lies among the last 4 letters of those 8 letters. Similarly, the third and the fourth bit each signify the half in which the letter lies.
<br>   For example, the letter j would be encoded as :
<br>   Among (a,b,c,d,e,f,g,h | i,j,k,l,m,n,o,p), j appears in the second half. So the first bit of its encoding is 1.
<br>   Now, among (i,j,k,l | m,n,o,p), j appears in the first half. So the second bit of its encoding is 0.
<br>   Now, among (i,j | k,l), j appears in the first half. So the third bit of its encoding is 0.
<br>   Now, among (i | j), j appears in the second half. So the fourth and last bit of its encoding is 1.
<br>   So j's encoding is 1001, <a href="https://www.codechef.com/JAN21C/problems/DECODEIT">(orignal question)</a>
<br>   --<a href="https://github.com/Amarpsp10/Daily-questions/blob/main/solutions/03.java">solution</a>

<hr>

4. You are given a sequence A1,A2,…,AN. Find the maximum value of the expression |Ax−Ay|+|Ay−Az|+|Az−Ax| over all triples of pairwise distinct valid indices (x,y,z) <a href="https://www.codechef.com/FEB21C/problems/MAXFUN">(Original question)</a>
<br>  --<a href ="https://github.com/Amarpsp10/Daily-questions/blob/main/solutions/04.java">solution</a>

<hr>

5. There are N frogs (numbered 1 through N) in a line. For each valid i, the i-th frog is initially at the position i, it has weight Wi, and whenever you hit its back, it jumps a distance Li to the right, i.e. its position increases by Li. The weights of the frogs are pairwise distinct.
<br> You can hit the back of each frog any number of times (possibly zero, not necessarily the same for all frogs) in any order. The frogs do not intefere with each other, so        there can be any number of frogs at the same time at each position.
<br> Your task is to sort the frogs in the increasing order of weight using the smallest possible number of hits. In other words, after all the hits are performed, then for each      pair of frogs (i,j) such that Wi<Wj, the position of the i-th frog should be strictly smaller than the position of the j-th frog. Find the smallest number of hits needed to      achieve such a state.<a href="https://www.codechef.com/FEB21C/problems/FROGS">(Original question)</a>
<br> --<a href="https://github.com/Amarpsp10/Daily-questions/blob/main/solutions/05.java">solution</a>

<hr>

6.Сhef has assembled a football team! Now he needs to choose a name for his team. There are N words in English that Chef considers funny. These words are s1,s2,…,sN.
<br>Chef thinks that a good team name should consist of two words such that they are not funny, but if we swap the first letters in them, the resulting words are funny. Note that under the given constraints, this means that a word is a non-empty string containing only lowercase English letters.
<br>Can you tell Chef how many good team names there are?<a href="https://www.codechef.com/FEB21C/problems/TEAMNAME">(Original question)</a>
<br> --<a href="https://github.com/Amarpsp10/Daily-questions/blob/main/solutions/06.java">solution</a>