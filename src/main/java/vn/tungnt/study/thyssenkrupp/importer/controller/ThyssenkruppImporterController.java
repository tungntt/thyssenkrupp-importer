package vn.tungnt.study.thyssenkrupp.importer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.tungnt.study.cdipp.importer.addon.controller.AbstractReactiveFrontRestController;
import vn.tungnt.study.cdipp.importer.addon.controller.CdippRestController;
import vn.tungnt.study.thyssenkrupp.importer.model.ThyssenkruppCustomerProcessingModel;
import vn.tungnt.study.thyssenkrupp.importer.model.ThyssenkruppCustomerRequestModel;
import vn.tungnt.study.thyssenkrupp.importer.model.ThyssenkruppCustomerResponseModel;

/**
 * @author nttung 1/15/20
 * @project thyssenkrupp-importer
 */
@CdippRestController
public class ThyssenkruppImporterController extends AbstractReactiveFrontRestController<ThyssenkruppCustomerResponseModel, ThyssenkruppCustomerRequestModel, ThyssenkruppCustomerProcessingModel> {

    private static final Logger LOG = LoggerFactory.getLogger(ThyssenkruppImporterController.class);

    @Override
    protected ThyssenkruppCustomerProcessingModel transform(ThyssenkruppCustomerRequestModel requestData) {
        LOG.info("*** Transform Data ***");
        return null;
    }

    @Override
    protected void pushToQueue(ThyssenkruppCustomerProcessingModel processingData) {
        LOG.info("*** Push Data into queue ***");
    }

    @Override
    protected ThyssenkruppCustomerResponseModel postBackStatus() {
        LOG.info("*** Return response to customer ***");
        ThyssenkruppCustomerResponseModel responseModel = new ThyssenkruppCustomerResponseModel();
        responseModel.setValid(true);
        return responseModel;
    }
}

