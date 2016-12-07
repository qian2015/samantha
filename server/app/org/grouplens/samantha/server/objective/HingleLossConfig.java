package org.grouplens.samantha.server.objective;

import org.grouplens.samantha.modeler.solver.HingeLoss;
import org.grouplens.samantha.modeler.solver.ObjectiveFunction;
import org.grouplens.samantha.server.io.RequestContext;
import play.Configuration;
import play.inject.Injector;

public class HingleLossConfig {
    static public ObjectiveFunction getObjectiveFunction(Configuration objectiveConfig,
                                                         Injector injector,
                                                         RequestContext requestContext) {
        return new HingeLoss();
    }
}