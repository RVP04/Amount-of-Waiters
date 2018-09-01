# Amount of Waiters
<p>There are <strong>W</strong> waiters in a restaurant and <strong>N</strong> families dining in. The waiters are serving the families in round robin fashion. Each family spends <strong>X</strong> amount for the waiter serving them. The program must print the amount given to each waiter as the output.</p>

<p><strong>Boundary Condition(s):</strong><br>
1 &lt;= W &lt;= 50<br>
1 &lt;= N &lt;= 1000</p>

<p><strong>Input Format:</strong><br>
The first line contains the value of <strong>W</strong> and <strong>N</strong> separated by a space.<br>
The second line contains the amount given by each family separated by space(s).</p>

<p><strong>Output Format:</strong><br>
The first line contains the amount received by each waiter separated by space(s).</p>

<p><strong>Example Input/Output 1:</strong><br>
Input:<br>
3 5<br>
100 150 125 50 25</p>

<p>Output:<br>
150 175 125</p>

<p>Explanation:<br>
The first waiter recieved the amount of Rs.100 from the first family.<br>
The second waiter received the amount of Rs.150 from the second family.<br>
The third waiter received the amount of Rs.125 from the third family.<br>
Again, the first waiter received the amount of Rs.50 from the fourth family. Now, the amount received by the first waiter in total is Rs.150 (100 + 50).<br>
The second waiter received the amount of Rs.25 from the fifth family. Now, the amount received by the second waiter in total is Rs.175 (150 + 25).<br>
Hence, 150 175 125 is printed as output.</p>

<p><strong>Example Input/Output 2:</strong><br>
Input:<br>
7 5<br>
100 150 100 200 50</p>

<p>Output:<br>
100 150 100 200 50 0 0</p>
