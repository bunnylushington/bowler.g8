package $package$

import org.bowlerframework.controller.{Controller,FunctionNameConventionRoutes}
import org.bowlerframework.model.{ParameterMapper, Validations}
import org.bowlerframework.view.{Renderable}

class $controller_name$
  extends Controller 
  with ParameterMapper
  with Validations 
  with Renderable  
  with FunctionNameConventionRoutes {


  def `GET /` = render
}
