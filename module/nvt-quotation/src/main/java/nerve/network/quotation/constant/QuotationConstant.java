/**
 * MIT License
 * <p>
 * Copyright (c) 2019-2020 nerve.network
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package nerve.network.quotation.constant;

/**
 * @author: Chino
 * @date: 2020/03/26
 */
public interface QuotationConstant {

    /** 报价的txData数据类型常量 */
    byte QUOTE_TXDATA_TYPE = 1;

    String RPC_VERSION = "1.0";
    String SYS_FILE_ENCODING = "file.encoding";

    String PARAM_PASSWORD = "password";
    String PARAM_ADDRESS = "address";

    String QU_CONFIG_FILE = "quotation-config.json";
    String COLLECTOR_CONFIG_FILE = "collector-config.json";

    int INIT_CAPACITY_8 = 8;
    int INIT_CAPACITY_4 = 4;
    int INIT_CAPACITY_2 = 2;

    /** 计算价格时保留小数位数 */
    int SCALE = 8;

    /** 配置信息表名 */
    String DB_MODULE_CONGIF = "config";

    /** 存储各节点的报价交易数据 */
    String DB_QUOTATION_NODE_PREFIX = "quotation_node_";

    /** 存储计算后的最终报价 */
    String DB_QUOTATION_FINAL_PREFIX = "final_quotation_final_";

    String DB_LAST_QUOTATION_PREFIX = "last_quotation_";


    /** 存储计算后的最终报价 */
    String DB_CONFIRM_FINAL_QUOTATION_PREFIX = "confirm_final_quotation_";

    String DB_CONFIRM_LAST_FINAL_QUOTATION_PREFIX = "confirm_last_final_quotation_";

    /**
     * 更新覆盖最近一次确认最终报价时，备份当前报价时的key前缀（以防回滚）
     */
    String BACKUP_CONFIRM_LAST_FINAL_QUOTATION_KEY_PREFIX = "PREVIOUS";

    /** 获取报价线程*/
    String QU_COLLECTOR_THREAD = "quotationCollector";
    /** 计算最终报价线程*/
    String QU_CALCULATOR_THREAD = "quotationCalculator";
    /** 报价处理task, 初始延迟值(分) */
    int QU_TASK_INITIALDELAY = 1;//1
    /** 报价处理task, 运行周期间隔(分) */
    int QUTASK_PERIOD = 1;//5


    String NULS_PRICE = "NULS_PRICE";
    String NULS_ANCHORTOKEN = "NULS-USDT";

    String NERVE_PRICE = "NERVE_PRICE";
    String NERVE_ANCHORTOKEN = "NERVE-USDT";

    /** nerve 的价格是否基于NULS来计算 默认值0:不是, 1:是**/
    byte NERVE_BASED_NULS = 0;
}
