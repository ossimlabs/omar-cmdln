package omar.cmdln.app

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration
{
  static void main(String[] args)
  {
    def applicationContext = GrailsApp.run(Application, args)

    if ( args.length )
    {
      for ( x in args )
      {
        applicationContext.stageDirectoryService.serviceMethod(x)
      }
    }
    else
    {
      println "Must specify at least on directory."
    }

    System.exit(0)
  }
}
