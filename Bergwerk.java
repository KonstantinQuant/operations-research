import gurobi.GRB;
import gurobi.GRBEnv;
import gurobi.GRBException;
import gurobi.GRBLinExpr;
import gurobi.GRBModel;
import gurobi.GRBVar;

public class Bergwerk {

	public static void main(String[] args) {
		try {
			// Create environment and model
			GRBEnv env = new GRBEnv();
			GRBModel model = new GRBModel(env);
			int[] neededWorkers = { 7, 8, 7, 10, 13, 12, 10 };

			// Create variables and set objective coefficients			
			GRBVar x1 = model.addVar(0, GRB.INFINITY, 0, GRB.CONTINUOUS, "x1");
			GRBVar x2 = model.addVar(0, GRB.INFINITY, 0, GRB.CONTINUOUS, "x2");

			// Add constraints
			GRBLinExpr expr = new GRBLinExpr();
			expr.addTerm(6, x1);
			expr.addTerm(2, x2);
			model.addConstr(expr, GRB.GREATER_EQUAL, 12, "c_1");
			expr.clear();
			
			
			expr.addTerm(2, x1);
			expr.addTerm(2, x2);
			model.addConstr(expr, GRB.GREATER_EQUAL, 8, "c_1");
			expr.clear();
			
			
			expr.addTerm(4, x1);
			expr.addTerm(12, x2);
			model.addConstr(expr, GRB.GREATER_EQUAL, 24, "c_1");
			expr.clear();
			
			
			GRBLinExpr objective = new GRBLinExpr();
			objective.addTerm(200, x1);
			objective.addTerm(160, x2);
			model.setObjective(objective, GRB.MINIMIZE);
			
			// Write out Gurobi model
			model.write("./bergwerk.lp");

			// Optimize model
			model.optimize();

			// Print out solution
			System.out.println("Objective Value: " + model.get(GRB.DoubleAttr.ObjVal));
			System.out.println(x1.get(GRB.StringAttr.VarName) + " = " + x1.get(GRB.DoubleAttr.X));
			System.out.println(x2.get(GRB.StringAttr.VarName) + " = " + x2.get(GRB.DoubleAttr.X));
			

			// Dispose model and environment
			model.dispose();
			env.dispose();

		} catch (GRBException e) {
			System.out.println("Error code: " + e.getErrorCode() + ". " + e.getMessage());
		}
	}
}
