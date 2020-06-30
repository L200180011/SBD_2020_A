from datetime import date,datetime,timedelta
import mysql.connector

cnx=mysql.connector.connect(user='root',database='perbankan')
cursor=cnx.cursor()
tanggal=datetime.now().date()
query = ("UPDATE transaksi SET jenis_transaksi = 'kredit' WHERE no_transaksi = 53")
cursor.execute(query)

cnx.commit()
cursor.close()
cnx.close()
