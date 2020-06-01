import kid.kidParser;
import kid.kidBaseVisitor;
import java.util.HashMap;
import java.util.Stack;
import java.lang.Override;


public class MyVisitor extends kidBaseVisitor<Object> {
    HashMap<String, Object> consts = new HashMap<>();
    String procedure = "";
    boolean global = false;
    HashMap<String, Object> functionTables = new HashMap<>();
    Stack<HashMap<String, Object>> tables = new Stack<>();
    HashMap<String, kidParser.BlockContext> function = new HashMap<>();
    Stack<HashMap<String, Object>> currentStack;
    HashMap<String, Object> currentTable;

    private Object getVariable(String ident) throws Exception {
        if (currentTable.containsKey(ident))
            return currentTable.get(ident);
        for (HashMap<String, Object> hm : currentStack) {
            if (hm.containsKey(ident)) {
                return hm.get(ident);
            }
        }
        if (consts.containsKey(ident)) {
            return consts.get(ident);
        }

        throw new Exception("No such variable in the table");
    }

    @Override
    public String visitIfstmt(kidParser.IfstmtContext ctx) {
        System.out.println("begin if :");
        String conclusionResult = (String) visit(ctx.conditionunion());
        if (conclusionResult.equals("true")) {
            currentStack.push(currentTable);
            visit(ctx.block(0));
            currentTable = currentStack.pop();
        }
        else if((ctx.block(1)!=null))
            {
                currentStack.push(currentTable);
                visit(ctx.block(1));
                currentTable=currentStack.pop();
            }
//        else
//        {
//
//        }
        return null;
    }

    @Override
    public String visitWhilestmt(kidParser.WhilestmtContext ctx) {
        System.out.println("bigin while: ");
        Object conditionResult = visit(ctx.conditionunion());
        while (conditionResult.equals("true")) {
            for (int i = 0; i < ctx.block().statement().size(); i++)
                visit(ctx.block().statement(i));
            conditionResult = visit(ctx.conditionunion());
        }
        return null;
    }

    @Override
    public String visitOr(kidParser.OrContext ctx) {
        for (int i = 0; i < ctx.condition().size(); i++) {
            Object result = visitChildren(ctx);
            if (result == null) {
                System.err.println("Conclusion NULL exception");
                //  System.exit(1);
            }
            //assert result != null;
            if (result.equals("false")) return "false";
        }
        return "true";
    }

    @Override
    public String visitCompar(kidParser.ComparContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));
        String sub = ".";
        boolean flag;

        if (left.toString().contains(sub) || right.toString().contains(sub)) flag = true;
        else flag = false;

        switch (ctx.op.getText()) {
            case "==":
                if (flag) {
                    if (Float.parseFloat(left.toString()) == Float.parseFloat(right.toString()))
                        return "true";
                    else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) == Integer.parseInt(right.toString()))
                        return "true";
                    else return "false";
                }

            case "!=":
                if (flag) {
                    if (Float.parseFloat(left.toString()) != Float.parseFloat(right.toString()))
                        return "true";
                    else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) != Integer.parseInt(right.toString()))
                        return "true";
                    else return "false";
                }
            case "<":
                if (flag) {
                    if (Float.parseFloat(left.toString()) < Float.parseFloat(right.toString()))
                        return "true";
                    else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) < Integer.parseInt(right.toString()))
                        return "true";
                    else return "false";
                }
            case "<=":
                if (flag) {
                    if (Float.parseFloat(left.toString()) <= Float.parseFloat(right.toString()))
                        return "true";
                    else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) <= Integer.parseInt(right.toString()))
                        return "true";
                    else return "false";
                }
            case ">":
                if (flag) {
                    if (Float.parseFloat(left.toString()) > Float.parseFloat(right.toString()))
                        return "true";
                    else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) > Integer.parseInt(right.toString()))
                        return "true";
                    else return "false";
                }
            case ">=":
                if (flag) {
                    if (Float.parseFloat(left.toString()) >= Float.parseFloat(right.toString()))
                        return "true";
                    else return "false";
                } else {
                    if (Integer.parseInt(left.toString()) >= Integer.parseInt(right.toString()))
                        return "true";
                    else return "false";
                }
        }
        return null;

    }

    //    @Override
//    public String  visitCondition(kidParser.ConditionContext ctx) {
//        return null;
//    }
    @Override
    public String visitFactorMult(kidParser.FactorMultContext ctx) {
        Object left = visit(ctx.expression(0));
        String sub = ".";
        Object right;
        float delf = 0;
        float multf = 0;
        float delwithpointf = 1;
        int deli = 0;
        int multi = 0;
        int delwithpointi = 0;
        boolean flag = false;
        if (ctx.expression(1) != null) {
            right = visit(ctx.expression(1));
        } else {
            right = new String("0");
        }
        String sl = left.toString();
        String sr = right.toString();
        char firstsimleft = sl.charAt(0);
        char firstsimright = sr.charAt(0);

        if (Character.isLetter(firstsimleft) || Character.isLetter(firstsimright)) {
            System.out.println("ERROR TYPE");
        }
        //System.out.println(sl+" +++++"+sr);
        if (sl.contains(sub) || sr.contains(sub)) {
            //  System.out.println(sl+" +++++"+sr);
            flag = true;
            float leftfloat = Float.parseFloat(left.toString());
            float rightfloat = Float.parseFloat(right.toString());
            delf = leftfloat / rightfloat;
            multf = leftfloat * rightfloat;
            delwithpointf = leftfloat % rightfloat;
            //System.out.println("float0 "+ delwithpointf+"  "+leftfloat+" % "+rightfloat);

        } else {
            // System.out.println(sl+" ----------"+sr);
            //  flag=false;
            int leftint = Integer.parseInt(left.toString());
            int rightint = Integer.parseInt(right.toString());
            deli = leftint / rightint;
            multi = leftint * rightint;
            delwithpointi = leftint % rightint;
            //  System.out.println("int0 "+ delwithpointi);
        }

        switch (ctx.op.getText()) {
            case "*":
                //  System.out.println(sl+" *"+sr);
                //currentTable.put(, exp);
                if (flag)
                    return String.valueOf(multf);
                else
                    return String.valueOf(multi);
            case "/": {
                //System.out.println(sl+" /"+sr);
                if (flag)
                    //currentTable.put(VarName, exp);
                    return String.valueOf(delf);
                else
                    return String.valueOf(deli);
            }
            case "%": {
                //System.out.println(sl + " %" + sr);
                if (flag) {
                    //  System.out.println("float1 "+ delwithpointf);
                    return String.valueOf(delwithpointf);
                } else {
                    //System.out.println("int1 "+delwithpointi);
                    return String.valueOf(delwithpointi);
                }
            }
        }


        return null;
    }

    @Override
    public String visitSummExpression(kidParser.SummExpressionContext ctx) {
        Object left = visit(ctx.expression(0));
        String sub = ".";
        Object right;
        if (ctx.expression(1) != null) {
            right = visit(ctx.expression(1));
        } else {
            right = new String("0");
        }
        float summf = 0;
        float differf = 0;
        int summi = 0;
        int differi = 0;
        char summc = '\n';
        char differc = '\n';
        boolean flag = false;
        String stringleft = left.toString();
        String stringright = right.toString();
        char firstsimleft = stringleft.charAt(0);
        char firstsimright = stringright.charAt(0);

        if (Character.isLetter(firstsimleft) || Character.isLetter(firstsimright)) {
            System.out.println("ERROR TYPE");
        }

        if (stringleft.contains(sub) || stringright.contains(sub)) {
            flag = true;
            float leftfloat = Float.parseFloat(left.toString());
            float rightfloat = Float.parseFloat(right.toString());
            summf = leftfloat + rightfloat;
            differf = leftfloat - rightfloat;
            //delwithpointf = leftfloat % rightfloat;
            //System.out.println("float0 "+ delwithpointf+"  "+leftfloat+" % "+rightfloat);

        } else {
            int leftint = Integer.parseInt(left.toString());
            int rightint = Integer.parseInt(right.toString());
            summi = leftint + rightint;
            differi = leftint - rightint;
            // delwithpointi = leftint%rightint;
            //  System.out.println("int0 "+ delwithpointi);
        }
        //System.out.println(left+"  "+right);
//        int leftint=Integer.parseInt(left.toString());
//        int rightint=Integer.parseInt(right.toString());
//        int summ=leftint+rightint;
//        int razn=leftint-rightint;
        // System.out.println(leftint+"  "+rightint+" = "+summ);
        // System.out.println(ctx.expression(0).getText()+" CTX");
        //System.out.println(ctx.op.getText()+" CTX");
        switch (ctx.op.getText()) {
            case "+":
                //  System.out.println(sl+" *"+sr);
                //currentTable.put(, exp);
                if (flag) {
                    //System.out.println("kak float");
                    return String.valueOf(summf);
                } else {
                    //System.out.println("kak int");
                    return String.valueOf(summi);
                }
            case "-": {
                //System.out.println(sl+" /"+sr);
                if (flag)
                    //currentTable.put(VarName, exp);
                    return String.valueOf(differf);
                else
                    return String.valueOf(differi);
            }
        }
        return null;
    }

    @Override
    public String visitConsts(kidParser.ConstsContext ctx) {
        currentTable = consts;
        visitChildren(ctx);
        return null;
    }

    @Override
    public String visitProgram(kidParser.ProgramContext ctx) {
        visitChildren(ctx);
        return null;
    }

    //    @Override String visitFunctions(kidParser.FunctionsContext ctx)
//    {
//        HashMap<String, Object> currentBlocktable = new HashMap<>();
//        currentTable = currentBlocktable;
//        visitChildren(ctx);
//        return null;
//    }
//    private void callFunct(String ident) throws Exception {
//        if (function.containsKey(ident)) {
//            function.get(ident);
//        } else throw new Exception("Procedure" + ident + " is not identified");
//    }



//    @Override
//    public Object visitFunctions(kidParser.FunctionsContext ctx) {
//        String ident = ctx.ident().getText();
//        function.put(ident, ctx.block());
//        procedure = ident;
//        global = false;
//        visit(ctx.block());
//        global = true;
//        procedure = "";
//        return null;
//    }
        @Override
        public String visitBlock (kidParser.BlockContext ctx){
            HashMap<String, Object> currentBlocktable = new HashMap<>();
            currentTable = currentBlocktable;
            visitChildren(ctx);
            //tables.add(currentBlocktable);

            return null;
        }

        @Override
        public String visitGlavprog (kidParser.GlavprogContext ctx){
        currentStack=tables;
        visitChildren(ctx);
            return null;
    }

        @Override
        public String visitStatement (kidParser.StatementContext ctx){
            return (String) visitChildren(ctx);
        }

//    @Override Object visitFunctions(kidParser.FunctionsContext ctx)
//    {
//
//    }
//@Override
//public String visitCallFunct(kidParser.CallFunctContext ctx) {
//    String Varname=ctx.ident().getText();
//    String toPrint = (String) visit(ctx.expressionunion());
//    //toPrint +=(String)visit(ctx.expressionunion());
//    //System.out.println("write( " + toPrint + ")");
//    return null;
//    System.out.println("bigin while: ");
//    Object conditionResult = visit(ctx.expressionunion());
//    while (conditionResult.equals("true")) {
//        for (int i = 0; i < ctx.block().statement().size(); i++)
//            visit(ctx.block().statement(i));
//        conditionResult = visit(ctx.conditionunion());
//    }
//    return null;
//}




//    @Override
//    public Object visitFunctions(kidParser.FunctionsContext ctx) {
//        String VarName = ctx.ident().getText();
//        String type = ctx.type().getText();
//        Object value = visit(ctx.parametr());
//        if (VarName == null) {
//            System.out.println("Error: you lost ident");
//        }
//            if (type == null) {
//                System.out.println("Error: you lost type");
//                if (ctx.children.contains(ctx.parametr()))
//                    value = visit(ctx.parametr());
//                currentStack = tables;
//                visitChildren(ctx);
//            }
//            return null;
//        }

        @Override
        public Object visitVars (kidParser.VarsContext ctx){
            String varName = ctx.ident().getText();
            String type = ctx.type().getText();
            Object value = visit(ctx.expression());
            if (ctx.children.contains(ctx.expression()))
                value = visit(ctx.expression());
            currentTable.put(varName, value);
            if (value != null)
                System.out.println("Vars: " + type + " " + varName + " " + value.toString());
            else
                System.out.println("VarDeclaration (no value): " + type + " " + varName + " as NULL");

            currentTable.put(varName, value);

            return null;
    }

    @Override
    public String visitExpressionunion(kidParser.ExpressionunionContext ctx) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < ctx.expression().size(); i ++) {
                result.append(visit(ctx.expression(i)));
                result.append(" ");
            }
            return result.toString();
        }

@Override
public String visitWritestmt(kidParser.WritestmtContext ctx) {
    String toPrint = (String) visit(ctx.expressionunion());
    //toPrint +=(String)visit(ctx.expressionunion());
    System.out.println("write( " + toPrint + ")");
    return null;
}


    @Override
    public Object visitIdent (kidParser.IdentContext ctx) {
        try {
            //System.out.println("GetVariable:" + ctx.getText() + " is: " + getVariable(ctx.getText()));
            return getVariable(ctx.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String  visitAssignstmt(kidParser.AssignstmtContext ctx) {
        try {
            String VarName = ctx.ident().getText();
           ///System.out.println(VarName+" VarName");
            Object exp = visit(ctx.expression());
            //System.out.println(exp+" EXP");
            //if(getVariable(VarName))
            currentTable.put(VarName, exp);
            System.out.println("Assigment: " + VarName + " " + exp);
        } catch (Exception e) {
                System.out.println("!!!Error!!!");
                System.out.println(e.fillInStackTrace());
            }
            return null;
    }


    @Override
        public String visitLiteral (kidParser.LiteralContext ctx){
        if (ctx.charLiteral()!= null)
        {
            if(ctx.charLiteral().STRING()!=null)
            return ctx.charLiteral().STRING().getText();
            if(ctx.charLiteral().NUMBER()!=null)
                return ctx.charLiteral().NUMBER().getText();
        }

        return ctx.getText();
        }

        @Override
        public Object visitFloatingPointLiteral (kidParser.FloatingPointLiteralContext ctx){
            System.out.println("Float: " + ctx.getText());
            return Float.parseFloat(ctx.getText());
        }

        @Override
        public Object visitIntegerLiteral (kidParser.IntegerLiteralContext ctx){
            System.out.println("Integer: " + ctx.getText());
            return Integer.parseInt(ctx.getText());
        }

        @Override
        public Object visitBooleanLiteral (kidParser.BooleanLiteralContext ctx){
            System.out.println("Boolean: " + ctx.getText());
            return Boolean.parseBoolean(ctx.getText());
        }

        @Override
        public Object visitCharLiteral (kidParser.CharLiteralContext ctx){
            System.out.println("Char: " + ctx.getText());
            return ctx.STRING().getText().charAt(0);
        }

    }
