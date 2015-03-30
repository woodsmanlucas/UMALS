/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umals;

import umals.recognizer.UMALSBaseVisitor;
import umals.recognizer.UMALSParser.ExpContext;
import umals.recognizer.UMALSParser.FunctiondefContext;
import umals.recognizer.UMALSParser.StatContext;

/**
 *
 * @author Declan Easton
 */
public class UMALSVisitorImpl extends UMALSBaseVisitor {
    
    
    @Override
    public String visitFunctiondef(FunctiondefContext ctx) {
        String service = ctx.name().SERVICENAME().getText();
        String name = ctx.name().NAME().getText();
        return "";
    }
    
    @Override
    public String visitStat(StatContext ctx) {
        if(!ctx.namelist().isEmpty() && !ctx.explist().isEmpty()) {
            if(ctx.namelist().children.size() == ctx.explist().children.size()) {
                //This is an assignmnet
                for(int i = 0; i < ctx.namelist().children.size(); i++) {
                    
                }
            }
        }
        return "";
    }
    
    @Override
    public String visitExp(ExpContext ctx) {
        return "";
    }
}
