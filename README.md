# Tutorial for Operations Research SS22 Konstantin Kuchenmeister
Teaching repository for the undergraduate course in Operations Research at Technical University Munich.


## Week 1: Modeling (of linear optimization systems)
Provided resources:
- Notes
- Created Gurobi code in Java to solve Exercise 1.1 (In order to run this file you need a working installation of Gurobi https://www.gurobi.com, and add the gurobi.jar file to the Java Classpath)

The code solves the following linear programming problem: (Exercise 1.1):

Minimize
$$
200 x_{1}+160 x_{2}=z
$$
sutch that
$$
\begin{aligned}
6 x_{1}+2 x_{2} & \geq 12 \\
2 x_{1}+2 x_{2} & \geq 8 \\
4 x_{1}+12 x_{2} & \geq 24 \\
x_{1}, x_{2} & \leq 7 \\
x_{1}, x_{2} & \geq 0
\end{aligned}
$$


