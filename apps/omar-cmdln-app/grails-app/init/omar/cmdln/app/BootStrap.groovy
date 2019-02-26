package omar.cmdln.app

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
