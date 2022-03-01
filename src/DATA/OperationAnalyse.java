/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;



/**
 *
 * @author ghada
 */
public class OperationAnalyse {
    private String codeAnalyse ;
    private String dateHeurOperation ;
    private String description ;
    private String result ;

    @Override
    public String toString() {
        return "OperationAnalyse{" + "codeAnalyse=" + codeAnalyse + ", dateHeurOperation=" + dateHeurOperation + ", description=" + description + ", result=" + result + '}';
    }

    public OperationAnalyse() {
    }

    public OperationAnalyse(String codeAnalyse, String dateHeurOperation, String description, String result) {
        this.codeAnalyse = codeAnalyse;
        this.dateHeurOperation = dateHeurOperation;
        this.description = description;
        this.result = result;
    }

    public String getCodeAnalyse() {
        return codeAnalyse;
    }

    public String getDateHeurOperation() {
        return dateHeurOperation;
    }

    public String getDescription() {
        return description;
    }

    public String getResult() {
        return result;
    }

    public void setCodeAnalyse(String codeAnalyse) {
        this.codeAnalyse = codeAnalyse;
    }

    public void setDateHeurOperation(String dateHeurOperation) {
        this.dateHeurOperation = dateHeurOperation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
}
