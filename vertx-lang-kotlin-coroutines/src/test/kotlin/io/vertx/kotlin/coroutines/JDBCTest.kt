package io.vertx.kotlin.coroutines

import io.vertx.ext.jdbc.DBConfigs
import io.vertx.ext.jdbc.JDBCClient
import io.vertx.ext.jdbc.JDBCClientTestBase
import io.vertx.ext.sql.SQLRowStream
import kotlinx.coroutines.channels.toList
import kotlinx.coroutines.runBlocking
import org.junit.BeforeClass
import org.junit.Test

/**
 * @author <a href="mailto:ruslan.sennov@gmail.com">Ruslan Sennov</a>
 */
class JDBCTest: JDBCClientTestBase() {

  companion object {
    @BeforeClass
    @JvmStatic
    fun createDb() {
      resetDb(JDBCClientTestBase::class.java)
    }
  }

  override fun setUp() {
    super.setUp()
    client = JDBCClient.create(vertx, DBConfigs.hsqldb(JDBCClientTestBase::class.java))
  }

  // https://github.com/vert-x3/vertx-jdbc-client/issues/253
  // One or more runs are enough
  @Test(timeout = 100000)
  fun `jdbc-client issue 253`() = runBlocking(vertx.dispatcher()) {
    val n = 10000
    for (step in 1..n) {
      if (step%100 == 0) {
        println("$step of $n done.")
      }
      val sql = "SELECT ID, FNAME, LNAME FROM select_table ORDER BY ID"
      val rows = awaitResult<SQLRowStream> { client.queryStream(sql, it) }
        .toReceiveChannel(vertx)
        .toList()
      assertEquals(2, rows.size)
    }
  }

}
