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
public class OperationDiagnostique {
    private String dateHeurOperation ;
    private String observation ;
    private String activiteMedicle;

    public OperationDiagnostique() {
    }

    @Override
    public String toString() {
        return "OperationDiagnostique{" + "dateHeurOperation=" + dateHeurOperation + ", observation=" + observation + ", activiteMedicle=" + activiteMedicle + '}';
    }
    

    public OperationDiagnostique(String dateHeurOperation, String observation, String activiteMedicle) {
        this.dateHeurOperation = dateHeurOperation;
        this.observation = observation;
        this.activiteMedicle = activiteMedicle;
    }

    public String getDateHeurOperation() {
        return dateHeurOperation;
    }

    public String getObservation() {
        return observation;
    }

    public String getActiviteMedicle() {
        return activiteMedicle;
    }

    public void setDateHeurOperation(String dateHeurOperation) {
        this.dateHeurOperation = dateHeurOperation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public void setActiviteMedicle(String activiteMedicle) {
        this.activiteMedicle = activiteMedicle;
    }
    
            
}
