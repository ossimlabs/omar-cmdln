package omar.cmdln.app

import omar.raster.RasterEntry
import omar.core.Repository
import omar.stager.StagerJob

class BootStrap {
  def sessionFactory

  def init = { servletContext ->
    //println RasterEntry.count()
    // ['/data/celtic', '/data/uav'].each {
    //   println it
    //   def repo = Repository.findOrCreateByBaseDir( it )
    //   repo.save()
    //   StagerJob.triggerNow( baseDir: repo.baseDir )
    // }
    // sessionFactory?.currentSession?.flush()
  }

  def destroy = {
  }
}
