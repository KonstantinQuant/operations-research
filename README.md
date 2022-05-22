# Tutorial for Operations Research SS22 Konstantin Kuchenmeister
Teaching repository for the undergraduate course in Operations Research at Technical University Munich.

## Logistics:

Every:
- Tuesday 2pm-3:30pm GMT+2
- Friday 3pm-4:30pm GMT+2

Location:
- Zoom

## Recordings:
- Week 1: https://youtu.be/9xSuFrGON5M
- Week 2: https://youtu.be/sqkcAcUGemo
- Week 3: https://www.youtube.com/watch?v=d-bfR1_H0Sc



## Week 1: Modeling (of linear optimization systems)
Provided resources:
- Notes
- Created Gurobi code in Java to solve Exercise 1.1 (In order to run this file you need a working installation of Gurobi https://www.gurobi.com, and add the gurobi.jar file to the Java Classpath)

The code solves the following linear programming problem: (Exercise 1.1):

Minimize
$
200 x_{1}+160 x_{2}=z
$
such that
$$
\begin{aligned}
6 x_{1}+2 x_{2} & \geq 12 \\
2 x_{1}+2 x_{2} & \geq 8 \\
4 x_{1}+12 x_{2} & \geq 24 \\
x_{1}, x_{2} & \leq 7 \\
x_{1}, x_{2} & \geq 0
\end{aligned}
$$


## Week 2: Solving linear optimization systems
- Graphically
- Normal-, standard-, canonical -Form
- Simplex Algorithm
- Big M Method
- Edge cases of linear optimization systems

## Week 3: Revised Big M Method Simplex in Matrix Notation, Modelling preemptive and weighted goal programming problems
- Revised Simplex in Matrix Form and Big-M-Method
- Goal Programming


# Disclaimer: 
All resources here I have created myself and I can in no way guarantee the accuracy of the information.
The faculty's lecture slides and practice materials are crucial with regard to the exam, not my notes.
