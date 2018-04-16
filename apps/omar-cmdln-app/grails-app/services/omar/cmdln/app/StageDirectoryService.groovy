package omar.cmdln.app

import omar.raster.RasterEntry
import omar.core.Repository
import omar.stager.StagerJob

import grails.gorm.transactions.Transactional

@Transactional
class StageDirectoryService {

    def serviceMethod(String dir) {
      // ['/data/celtic', '/data/uav'].each { dir
         println dir
        def repo = Repository.findOrCreateByBaseDir( dir )
        repo.save()
        StagerJob.triggerNow( baseDir: repo.baseDir )
      // }
      // sessionFactory?.currentSession?.flush()
    }
}
