package sample

import org.slf4j.LoggerFactory
import com.typesafe.config._


import org.joda.time.Instant;
import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
  * Created by zhoufeng on 16/4/17.
  */
object Samples {
  val logger = LoggerFactory.getLogger(Samples.getClass)

  val inst = new Instant()
  logger.info("Instant now is {}",inst.toDateTime)
  /**
    * com.typesafe.config
    */
  val conf = ConfigFactory.load()


  def apply(): Samples = new Samples(conf)
}

class Samples(arg: Config){
  /**
    * slf4j.LoggerFactory
    */
  //val logger = LoggerFactory.getLogger(Samples.getClass)
  Samples.logger.warn("class recive the Config {}", arg)

  //http://www.joda.org/joda-time/userguide.html
  lazy val dt: DateTime = new DateTime(GJChronology.getInstanceUTC)
  lazy val dt2: DateTime = new DateTime(1972, 10, 1, 0, 0, 0, 0, GJChronology.getInstance());

  lazy val dt3: MutableDateTime = new MutableDateTime(GJChronology.getInstance());

  //yyyy-MM-dd HH:mm:ss.SSSZZ
  lazy val df: DateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");

  val dtS = arg.getStringList("sample.date").toArray.map{case r:String => df.parseMutableDateTime(r)}
  val dtsAddDay = dtS.map{case dt: MutableDateTime => {println(dt); dt.addDays(1); dt}}
  dtsAddDay.foreach(println)


}
