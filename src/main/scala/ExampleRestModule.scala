import com.google.inject.Scopes
import mesosphere.chaos.http.RestModule

/**
 * @author Tobi Knaup
 */

class ExampleRestModule extends RestModule {

  protected override def configureServlets() {
    super.configureServlets()

    bind(classOf[ExampleResource]).in(Scopes.SINGLETON)
  }

}
