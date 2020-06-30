from datetime import date,datetime,timedelta
import mysql.connector

cnx=mysql.connector.connect(user='root',database='perbankan')
cursor=cnx.cursor()
tanggal=datetime.now().date()
hapus_transaksi = ("DELETE FROM transaksi WHERE no_transaksi=53")
cursor.execute(hapus_transaksi)

cnx.commit()
cursor.close()
cnx.close()
